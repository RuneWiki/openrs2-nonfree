import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public abstract class Class147 {

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!hca", name = "B", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!hp;")
	private Class14_Sub4_Sub3 aClass14_Sub4_Sub3_2;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "Lclient!wca;")
	private Class14_Sub4_Sub4 aClass14_Sub4_Sub4_2;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "Lclient!fl;")
	private Class14_Sub4_Sub2 aClass14_Sub4_Sub2_2;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Z")
	private boolean aBoolean416;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "[B")
	private final byte[] aByteArray69;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!hca", name = "x", descriptor = "Lclient!fw;")
	private final Class125 aClass125_20;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(I)V")
	protected Class147(@OriginalArg(0) int arg0) {
		if (!Static425.method6393("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray69 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass125_20 = new Class125(8);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)D")
	public final double method5240() {
		if (this.aClass14_Sub4_Sub2_2 == null) {
			return this.aClass14_Sub4_Sub4_2 == null ? 0.0D : this.aClass14_Sub4_Sub4_2.method9272();
		} else {
			return this.aClass14_Sub4_Sub2_2.method2438();
		}
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V")
	private void method5241() throws IOException {
		while (this.aClass14_Sub4_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(14) Class14_Sub4 local14 = this.method5254();
			if (local14 == null) {
				if (this.aBoolean413) {
					this.method5248();
				}
				return;
			}
			if (local14 == this.aClass14_Sub4_Sub3_2) {
				this.method5243();
			}
		}
		this.aClass14_Sub4_Sub4_2.method9264(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)Lclient!fl;")
	public final Class14_Sub4_Sub2 method5242() {
		return this.aClass14_Sub4_Sub2_2;
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)V")
	private void method5243() {
		for (@Pc(19) Class14_Sub4 local19 = (Class14_Sub4) this.aClass125_20.method2633(); local19 != null; local19 = (Class14_Sub4) this.aClass125_20.method2627()) {
			if (local19 instanceof Class14_Sub4_Sub3) {
				@Pc(29) Class14_Sub4_Sub3 local29 = (Class14_Sub4_Sub3) local19;
				while ((local29.anInt10922 <= 8 || this.method5240() > (double) local29.method3906()) && local29.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local29.method9264(this.anOggPacket2);
				}
			}
		}
		this.method5251(this.aString76);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
	public final void method5244() throws IOException {
		if (this.aBoolean415) {
			return;
		}
		while (!this.aBoolean414) {
			@Pc(35) Class14_Sub4 local35;
			if (this.aBoolean416) {
				local35 = (Class14_Sub4) this.aClass125_20.method2630((long) this.anOggPage2.getSerialNumber());
			} else {
				local35 = this.method5254();
				if (local35 == null) {
					if (this.aBoolean413) {
						this.method5248();
					}
					return;
				}
				if (local35 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean416 = true;
			}
			if (this.aClass14_Sub4_Sub2_2 == local35) {
				if (this.aClass14_Sub4_Sub2_2.method2437() >= 50) {
					return;
				}
				while (this.aClass14_Sub4_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass14_Sub4_Sub2_2.method9264(this.anOggPacket2);
					this.method5243();
					if (this.aClass14_Sub4_Sub4_2 != null) {
						@Pc(188) double local188 = this.aClass14_Sub4_Sub4_2.method9272();
						for (@Pc(190) int local190 = 0; local190 < 10 && this.method5250(); local190++) {
							this.method5241();
							if (this.aBoolean414) {
								return;
							}
						}
						if (this.aClass14_Sub4_Sub4_2.method9272() > local188) {
							return;
						}
					}
					if (this.aClass14_Sub4_Sub2_2.method2437() >= 50) {
						return;
					}
				}
			} else if (local35 instanceof Class14_Sub4_Sub3) {
				this.method5243();
			} else if (this.aClass14_Sub4_Sub4_2 != local35) {
				while (local35.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local35.anInt10922 == 1 && local35 instanceof Class14_Sub4_Sub3) {
						this.method5251(this.aString76);
					}
					local35.method9264(this.anOggPacket2);
				}
			} else if (this.aClass14_Sub4_Sub2_2 == null && !this.aBoolean415) {
				for (@Pc(133) int local133 = 0; local133 < 10 && this.method5250(); local133++) {
					this.method5241();
					if (this.aBoolean414) {
						return;
					}
				}
				return;
			}
			this.aBoolean416 = false;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Lclient!wca;")
	public final Class14_Sub4_Sub4 method5245() {
		return this.aClass14_Sub4_Sub4_2;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "([BB)I")
	protected abstract int method5247(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(Z)V")
	private void method5248() {
		for (@Pc(11) Class14_Sub4 local11 = (Class14_Sub4) this.aClass125_20.method2633(); local11 != null; local11 = (Class14_Sub4) this.aClass125_20.method2627()) {
			if (local11 != this.aClass14_Sub4_Sub4_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method9264(this.anOggPacket2);
				}
			}
		}
		if (this.aClass14_Sub4_Sub4_2 == null) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
			if (!this.method5250()) {
				return;
			}
			if (this.aClass14_Sub4_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method5255();
				return;
			}
			this.aClass14_Sub4_Sub4_2.method9264(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lclient!hp;")
	public final Class14_Sub4_Sub3 method5249() {
		return this.aClass14_Sub4_Sub3_2;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Z")
	private boolean method5250() {
		if (this.aClass14_Sub4_Sub2_2 == null) {
			@Pc(20) double local20 = (double) this.aClass14_Sub4_Sub4_2.method9271();
			return local20 == 0.0D || (double) Static26.method382() >= (double) this.aClass14_Sub4_Sub4_2.method9274() + 1000.0D / local20;
		} else {
			return !this.aClass14_Sub4_Sub4_2.method9273() || this.method5240() > this.aClass14_Sub4_Sub4_2.method9272();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method5251(@OriginalArg(1) String arg0) {
		this.aString76 = arg0;
		if (this.aString76 == null) {
			this.aClass14_Sub4_Sub3_2 = null;
			return;
		}
		if (this.aClass14_Sub4_Sub3_2 != null && !this.aString76.equals(this.aClass14_Sub4_Sub3_2.method3905())) {
			this.aClass14_Sub4_Sub3_2 = null;
		}
		if (this.aClass14_Sub4_Sub3_2 != null) {
			return;
		}
		for (@Pc(43) Class14_Sub4 local43 = (Class14_Sub4) this.aClass125_20.method2633(); local43 != null; local43 = (Class14_Sub4) this.aClass125_20.method2627()) {
			if (local43 instanceof Class14_Sub4_Sub3) {
				@Pc(50) Class14_Sub4_Sub3 local50 = (Class14_Sub4_Sub3) local43;
				if (this.aString76.equals(local50.method3905())) {
					this.aClass14_Sub4_Sub3_2 = local50;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)Z")
	public final boolean method5253() {
		if (this.aBoolean414 || this.aBoolean413) {
			return this.aClass14_Sub4_Sub2_2 == null || this.aClass14_Sub4_Sub2_2.method2437() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "(I)Lclient!gga;")
	private Class14_Sub4 method5254() throws IOException {
		if (this.aBoolean414) {
			throw new IllegalStateException();
		} else if (this.aBoolean413) {
			return null;
		} else {
			@Pc(25) int local25;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local25 = this.method5247(this.aByteArray69);
				if (local25 == -1) {
					this.aBoolean413 = true;
					return null;
				}
				if (local25 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray69, local25)) {
					throw new RuntimeException("");
				}
			}
			local25 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(82) Class14_Sub4 local82 = (Class14_Sub4) this.aClass125_20.method2630((long) local25);
				if (!local82.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local82;
			}
			@Pc(100) OggStreamState local100 = new OggStreamState(local25);
			if (!local100.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local100.packetPeek(this.anOggPacket2) == 1) {
				@Pc(195) Class14_Sub4 local195;
				if (this.aClass14_Sub4_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass14_Sub4_Sub4_2 = new Class14_Sub4_Sub4(local100);
					local195 = this.aClass14_Sub4_Sub4_2;
				} else if (this.aClass14_Sub4_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass14_Sub4_Sub2_2 = new Class14_Sub4_Sub2(local100);
					local195 = this.aClass14_Sub4_Sub2_2;
				} else {
					@Pc(147) byte[] local147 = this.anOggPacket2.getData();
					@Pc(151) StringBuffer local151 = new StringBuffer();
					for (@Pc(153) int local153 = 1; local147.length > local153 && Character.isLetterOrDigit((char) local147[local153]); local153++) {
						local151.append((char) local147[local153]);
					}
					@Pc(182) String local182 = local151.toString();
					if (local182.equals("kate")) {
						local195 = new Class14_Sub4_Sub3(local100);
					} else {
						local195 = new Class14_Sub4_Sub1(local100);
					}
				}
				this.aClass125_20.method2626(local195, (long) local25);
				return local195;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
	public final void method5255() {
		if (this.aBoolean414) {
			return;
		}
		for (@Pc(19) Class14_Sub4 local19 = (Class14_Sub4) this.aClass125_20.method2633(); local19 != null; local19 = (Class14_Sub4) this.aClass125_20.method2627()) {
			local19.method9267();
			local19.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZI)V")
	public final void method5257(@OriginalArg(0) boolean arg0) {
		if (this.aClass14_Sub4_Sub2_2 != null) {
			@Pc(16) Class14_Sub1_Sub5 local16 = this.aClass14_Sub4_Sub2_2.method2439();
			if (local16 != null) {
				local16.method9331(arg0);
			}
		}
		this.aBoolean415 = !this.aBoolean415;
	}
}
