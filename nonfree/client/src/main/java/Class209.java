import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public abstract class Class209 {

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "Lclient!wda;")
	private Class2_Sub7_Sub4 aClass2_Sub7_Sub4_2;

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "Z")
	private boolean aBoolean363;

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "Lclient!br;")
	private Class2_Sub7_Sub1 aClass2_Sub7_Sub1_2;

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "Lclient!op;")
	private Class2_Sub7_Sub3 aClass2_Sub7_Sub3_2;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "[B")
	private final byte[] aByteArray65;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "Lclient!gca;")
	private final Class118 aClass118_33;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(I)V")
	protected Class209(@OriginalArg(0) int arg0) {
		if (!Static550.method7576("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray65 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass118_33 = new Class118(8);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)Z")
	private boolean method4354() {
		if (this.aClass2_Sub7_Sub4_2 == null) {
			@Pc(19) double local19 = (double) this.aClass2_Sub7_Sub1_2.method836();
			return local19 == 0.0D || (double) Static476.method6413() >= 1000.0D / local19 + (double) this.aClass2_Sub7_Sub1_2.method830();
		} else {
			return !this.aClass2_Sub7_Sub1_2.method831() || this.method4364() > this.aClass2_Sub7_Sub1_2.method833();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Lclient!br;")
	public final Class2_Sub7_Sub1 method4355() {
		return this.aClass2_Sub7_Sub1_2;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	public final void method4356() {
		if (this.aBoolean364) {
			return;
		}
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) this.aClass118_33.method2596(); local15 != null; local15 = (Class2_Sub7) this.aClass118_33.method2597()) {
			local15.method8318();
			local15.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean364 = true;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)V")
	private void method4357() {
		for (@Pc(11) Class2_Sub7 local11 = (Class2_Sub7) this.aClass118_33.method2596(); local11 != null; local11 = (Class2_Sub7) this.aClass118_33.method2597()) {
			if (local11 != this.aClass2_Sub7_Sub1_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method8316(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub7_Sub1_2 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
			if (!this.method4354()) {
				return;
			}
			if (this.aClass2_Sub7_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method4356();
				return;
			}
			this.aClass2_Sub7_Sub1_2.method8316(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
	public final void method4358() throws IOException {
		if (this.aBoolean361) {
			return;
		}
		while (!this.aBoolean364) {
			@Pc(27) Class2_Sub7 local27;
			if (this.aBoolean363) {
				local27 = (Class2_Sub7) this.aClass118_33.method2595((long) this.anOggPage2.getSerialNumber());
			} else {
				local27 = this.method4363();
				if (local27 == null) {
					if (this.aBoolean362) {
						this.method4357();
					}
					return;
				}
				if (local27 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean363 = true;
			}
			if (this.aClass2_Sub7_Sub4_2 == local27) {
				if (this.aClass2_Sub7_Sub4_2.method8319() >= 50) {
					return;
				}
				while (this.aClass2_Sub7_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub7_Sub4_2.method8316(this.anOggPacket2);
					this.method4360();
					if (this.aClass2_Sub7_Sub1_2 != null) {
						@Pc(81) double local81 = this.aClass2_Sub7_Sub1_2.method833();
						for (@Pc(83) int local83 = 0; local83 < 10 && this.method4354(); local83++) {
							this.method4366();
							if (this.aBoolean364) {
								return;
							}
						}
						if (local81 < this.aClass2_Sub7_Sub1_2.method833()) {
							return;
						}
					}
					if (this.aClass2_Sub7_Sub4_2.method8319() >= 50) {
						return;
					}
				}
			} else if (local27 instanceof Class2_Sub7_Sub3) {
				this.method4360();
			} else if (this.aClass2_Sub7_Sub1_2 != local27) {
				while (local27.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local27.anInt9987 == 1 && local27 instanceof Class2_Sub7_Sub3) {
						this.method4361(this.aString58);
					}
					local27.method8316(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub7_Sub4_2 == null && !this.aBoolean361) {
				for (@Pc(177) int local177 = 0; local177 < 10 && this.method4354(); local177++) {
					this.method4366();
					if (this.aBoolean364) {
						return;
					}
				}
				return;
			}
			this.aBoolean363 = false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)Lclient!op;")
	public final Class2_Sub7_Sub3 method4359() {
		return this.aClass2_Sub7_Sub3_2;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V")
	private void method4360() {
		for (@Pc(11) Class2_Sub7 local11 = (Class2_Sub7) this.aClass118_33.method2596(); local11 != null; local11 = (Class2_Sub7) this.aClass118_33.method2597()) {
			if (local11 instanceof Class2_Sub7_Sub3) {
				@Pc(19) Class2_Sub7_Sub3 local19 = (Class2_Sub7_Sub3) local11;
				while ((local19.anInt9987 <= 8 || this.method4364() > (double) local19.method5526()) && local19.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local19.method8316(this.anOggPacket2);
				}
			}
		}
		this.method4361(this.aString58);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4361(@OriginalArg(1) String arg0) {
		this.aString58 = arg0;
		if (this.aString58 == null) {
			this.aClass2_Sub7_Sub3_2 = null;
			return;
		}
		if (this.aClass2_Sub7_Sub3_2 != null && !this.aString58.equals(this.aClass2_Sub7_Sub3_2.method5527())) {
			this.aClass2_Sub7_Sub3_2 = null;
		}
		if (this.aClass2_Sub7_Sub3_2 != null) {
			return;
		}
		for (@Pc(45) Class2_Sub7 local45 = (Class2_Sub7) this.aClass118_33.method2596(); local45 != null; local45 = (Class2_Sub7) this.aClass118_33.method2597()) {
			if (local45 instanceof Class2_Sub7_Sub3) {
				@Pc(53) Class2_Sub7_Sub3 local53 = (Class2_Sub7_Sub3) local45;
				if (this.aString58.equals(local53.method5527())) {
					this.aClass2_Sub7_Sub3_2 = local53;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)Lclient!bda;")
	private Class2_Sub7 method4363() throws IOException {
		if (this.aBoolean364) {
			throw new IllegalStateException();
		} else if (this.aBoolean362) {
			return null;
		} else {
			@Pc(28) int local28;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local28 = this.method4367(this.aByteArray65);
				if (local28 == -1) {
					this.aBoolean362 = true;
					return null;
				}
				if (local28 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray65, local28)) {
					throw new RuntimeException("");
				}
			}
			local28 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(78) Class2_Sub7 local78 = (Class2_Sub7) this.aClass118_33.method2595((long) local28);
				if (!local78.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local78;
			}
			@Pc(95) OggStreamState local95 = new OggStreamState(local28);
			if (!local95.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local95.packetPeek(this.anOggPacket2) == 1) {
				@Pc(139) Class2_Sub7 local139;
				if (this.aClass2_Sub7_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub7_Sub1_2 = new Class2_Sub7_Sub1(local95);
					local139 = this.aClass2_Sub7_Sub1_2;
				} else if (this.aClass2_Sub7_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub7_Sub4_2 = new Class2_Sub7_Sub4(local95);
					local139 = this.aClass2_Sub7_Sub4_2;
				} else {
					@Pc(145) byte[] local145 = this.anOggPacket2.getData();
					@Pc(149) StringBuffer local149 = new StringBuffer();
					for (@Pc(151) int local151 = 1; local145.length > local151 && Character.isLetterOrDigit((char) local145[local151]); local151++) {
						local149.append((char) local145[local151]);
					}
					@Pc(178) String local178 = local149.toString();
					if (local178.equals("kate")) {
						local139 = new Class2_Sub7_Sub3(local95);
					} else {
						local139 = new Class2_Sub7_Sub2(local95);
					}
				}
				this.aClass118_33.method2601(local139, (long) local28);
				return local139;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)D")
	public final double method4364() {
		if (this.aClass2_Sub7_Sub4_2 == null) {
			return this.aClass2_Sub7_Sub1_2 == null ? 0.0D : this.aClass2_Sub7_Sub1_2.method833();
		} else {
			return this.aClass2_Sub7_Sub4_2.method8320();
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(IZ)V")
	public final void method4365(@OriginalArg(1) boolean arg0) {
		if (this.aClass2_Sub7_Sub4_2 != null) {
			@Pc(15) Class2_Sub13_Sub5 local15 = this.aClass2_Sub7_Sub4_2.method8322();
			if (local15 != null) {
				local15.method8181(arg0);
			}
		}
		this.aBoolean361 = !this.aBoolean361;
	}

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)V")
	private void method4366() throws IOException {
		while (this.aClass2_Sub7_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class2_Sub7 local11 = this.method4363();
			if (local11 == null) {
				if (this.aBoolean362) {
					this.method4357();
				}
				return;
			}
			if (this.aClass2_Sub7_Sub3_2 == local11) {
				this.method4360();
			}
		}
		this.aClass2_Sub7_Sub1_2.method8316(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[B)I")
	protected abstract int method4367(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(Z)Z")
	public final boolean method4368() {
		if (this.aBoolean364 || this.aBoolean362) {
			return this.aClass2_Sub7_Sub4_2 == null || this.aClass2_Sub7_Sub4_2.method8319() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "(I)Lclient!wda;")
	public final Class2_Sub7_Sub4 method4370() {
		return this.aClass2_Sub7_Sub4_2;
	}
}
