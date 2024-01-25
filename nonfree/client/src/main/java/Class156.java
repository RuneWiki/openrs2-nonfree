import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public abstract class Class156 {

	@OriginalMember(owner = "client!tha", name = "n", descriptor = "Lclient!kb;")
	private Class2_Sub12_Sub3 aClass2_Sub12_Sub3_2;

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "Z")
	private boolean aBoolean340;

	@OriginalMember(owner = "client!tha", name = "i", descriptor = "Lclient!rs;")
	private Class2_Sub12_Sub4 aClass2_Sub12_Sub4_2;

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "Ljava/lang/String;")
	private String aString46;

	@OriginalMember(owner = "client!tha", name = "w", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!tha", name = "u", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "Z")
	private boolean aBoolean343;

	@OriginalMember(owner = "client!tha", name = "p", descriptor = "Lclient!ca;")
	private Class2_Sub12_Sub1 aClass2_Sub12_Sub1_2;

	@OriginalMember(owner = "client!tha", name = "A", descriptor = "[B")
	private final byte[] aByteArray52;

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!tha", name = "v", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "Lclient!lba;")
	private final Class218 aClass218_21;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(I)V")
	protected Class156(@OriginalArg(0) int arg0) {
		if (!Static548.method7659("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray52 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass218_21 = new Class218(8);
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(B)V")
	private void method3409() {
		for (@Pc(21) Class2_Sub12 local21 = (Class2_Sub12) this.aClass218_21.method5092(); local21 != null; local21 = (Class2_Sub12) this.aClass218_21.method5096()) {
			if (local21 instanceof Class2_Sub12_Sub3) {
				@Pc(31) Class2_Sub12_Sub3 local31 = (Class2_Sub12_Sub3) local21;
				while ((local31.anInt8868 <= 8 || this.method3411() > (double) local31.method4447()) && local31.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local31.method7842(this.anOggPacket2);
				}
			}
		}
		this.method3424(this.aString46);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
	private void method3410() throws IOException {
		while (this.aClass2_Sub12_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(21) Class2_Sub12 local21 = this.method3415();
			if (local21 == null) {
				if (this.aBoolean343) {
					this.method3417();
				}
				return;
			}
			if (local21 == this.aClass2_Sub12_Sub3_2) {
				this.method3409();
			}
		}
		this.aClass2_Sub12_Sub4_2.method7842(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)D")
	public final double method3411() {
		if (this.aClass2_Sub12_Sub1_2 == null) {
			return this.aClass2_Sub12_Sub4_2 == null ? 0.0D : this.aClass2_Sub12_Sub4_2.method7852();
		} else {
			return this.aClass2_Sub12_Sub1_2.method1063();
		}
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)Z")
	private boolean method3412() {
		if (this.aClass2_Sub12_Sub1_2 == null) {
			@Pc(20) double local20 = (double) this.aClass2_Sub12_Sub4_2.method7845();
			return local20 == 0.0D || (double) Static567.method7863() >= 1000.0D / local20 + (double) this.aClass2_Sub12_Sub4_2.method7849();
		} else {
			return !this.aClass2_Sub12_Sub4_2.method7844() || this.method3411() > this.aClass2_Sub12_Sub4_2.method7852();
		}
	}

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "(I)V")
	public final void method3413() {
		if (this.aBoolean341) {
			return;
		}
		for (@Pc(23) Class2_Sub12 local23 = (Class2_Sub12) this.aClass218_21.method5092(); local23 != null; local23 = (Class2_Sub12) this.aClass218_21.method5096()) {
			local23.method7843();
			local23.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean341 = true;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)Lclient!kb;")
	public final Class2_Sub12_Sub3 method3414() {
		return this.aClass2_Sub12_Sub3_2;
	}

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "(I)Lclient!il;")
	private Class2_Sub12 method3415() throws IOException {
		if (this.aBoolean341) {
			throw new IllegalStateException();
		} else if (this.aBoolean343) {
			return null;
		} else {
			@Pc(34) int local34;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local34 = this.method3422(this.aByteArray52);
				if (local34 == -1) {
					this.aBoolean343 = true;
					return null;
				}
				if (local34 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray52, local34)) {
					throw new RuntimeException("");
				}
			}
			local34 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(90) Class2_Sub12 local90 = (Class2_Sub12) this.aClass218_21.method5095((long) local34, 0);
				if (!local90.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local90;
			}
			@Pc(108) OggStreamState local108 = new OggStreamState(local34);
			if (!local108.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local108.packetPeek(this.anOggPacket2) == 1) {
				@Pc(199) Class2_Sub12 local199;
				if (this.aClass2_Sub12_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub12_Sub4_2 = new Class2_Sub12_Sub4(local108);
					local199 = this.aClass2_Sub12_Sub4_2;
				} else if (this.aClass2_Sub12_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub12_Sub1_2 = new Class2_Sub12_Sub1(local108);
					local199 = this.aClass2_Sub12_Sub1_2;
				} else {
					@Pc(155) byte[] local155 = this.anOggPacket2.getData();
					@Pc(159) StringBuffer local159 = new StringBuffer();
					for (@Pc(161) int local161 = 1; local155.length > local161 && Character.isLetterOrDigit((char) local155[local161]); local161++) {
						local159.append((char) local155[local161]);
					}
					@Pc(186) String local186 = local159.toString();
					if (local186.equals("kate")) {
						local199 = new Class2_Sub12_Sub3(local108);
					} else {
						local199 = new Class2_Sub12_Sub2(local108);
					}
				}
				this.aClass218_21.method5099(local199, (long) local34);
				return local199;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)Lclient!rs;")
	public final Class2_Sub12_Sub4 method3416() {
		return this.aClass2_Sub12_Sub4_2;
	}

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "(I)V")
	private void method3417() {
		for (@Pc(18) Class2_Sub12 local18 = (Class2_Sub12) this.aClass218_21.method5092(); local18 != null; local18 = (Class2_Sub12) this.aClass218_21.method5096()) {
			if (this.aClass2_Sub12_Sub4_2 != local18) {
				while (local18.anOggStreamState5.packetOut() == 1) {
					local18.method7842(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub12_Sub4_2 == null) {
			return;
		}
		for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
			if (!this.method3412()) {
				return;
			}
			if (this.aClass2_Sub12_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method3413();
				return;
			}
			this.aClass2_Sub12_Sub4_2.method7842(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "(I)V")
	public final void method3418() throws IOException {
		if (this.aBoolean342) {
			return;
		}
		while (!this.aBoolean341) {
			@Pc(35) Class2_Sub12 local35;
			if (this.aBoolean340) {
				local35 = (Class2_Sub12) this.aClass218_21.method5095((long) this.anOggPage2.getSerialNumber(), 0);
			} else {
				local35 = this.method3415();
				if (local35 == null) {
					if (this.aBoolean343) {
						this.method3417();
					}
					return;
				}
				if (local35 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean340 = true;
			}
			if (local35 == this.aClass2_Sub12_Sub1_2) {
				if (this.aClass2_Sub12_Sub1_2.method1062() >= 50) {
					return;
				}
				while (this.aClass2_Sub12_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub12_Sub1_2.method7842(this.anOggPacket2);
					this.method3409();
					if (this.aClass2_Sub12_Sub4_2 != null) {
						@Pc(95) double local95 = this.aClass2_Sub12_Sub4_2.method7852();
						for (@Pc(97) int local97 = 0; local97 < 10 && this.method3412(); local97++) {
							this.method3410();
							if (this.aBoolean341) {
								return;
							}
						}
						if (local95 < this.aClass2_Sub12_Sub4_2.method7852()) {
							return;
						}
					}
					if (this.aClass2_Sub12_Sub1_2.method1062() >= 50) {
						return;
					}
				}
			} else if (local35 instanceof Class2_Sub12_Sub3) {
				this.method3409();
			} else if (this.aClass2_Sub12_Sub4_2 != local35) {
				while (local35.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local35.anInt8868 == 1 && local35 instanceof Class2_Sub12_Sub3) {
						this.method3424(this.aString46);
					}
					local35.method7842(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub12_Sub1_2 == null && !this.aBoolean342) {
				for (@Pc(184) int local184 = 0; local184 < 10 && this.method3412(); local184++) {
					this.method3410();
					if (this.aBoolean341) {
						return;
					}
				}
				return;
			}
			this.aBoolean340 = false;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)Lclient!ca;")
	public final Class2_Sub12_Sub1 method3419() {
		return this.aClass2_Sub12_Sub1_2;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZ)V")
	public final void method3420(@OriginalArg(1) boolean arg0) {
		if (this.aClass2_Sub12_Sub1_2 != null) {
			@Pc(11) Class2_Sub23_Sub1 local11 = this.aClass2_Sub12_Sub1_2.method1060();
			if (local11 != null) {
				local11.method2416(arg0);
			}
		}
		this.aBoolean342 = !this.aBoolean342;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I[B)I")
	protected abstract int method3422(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(Z)Z")
	public final boolean method3423() {
		if (this.aBoolean341 || this.aBoolean343) {
			return this.aClass2_Sub12_Sub1_2 == null || this.aClass2_Sub12_Sub1_2.method1062() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method3424(@OriginalArg(0) String arg0) {
		this.aString46 = arg0;
		if (this.aString46 == null) {
			this.aClass2_Sub12_Sub3_2 = null;
			return;
		}
		if (this.aClass2_Sub12_Sub3_2 != null && !this.aString46.equals(this.aClass2_Sub12_Sub3_2.method4450())) {
			this.aClass2_Sub12_Sub3_2 = null;
		}
		if (this.aClass2_Sub12_Sub3_2 != null) {
			return;
		}
		for (@Pc(43) Class2_Sub12 local43 = (Class2_Sub12) this.aClass218_21.method5092(); local43 != null; local43 = (Class2_Sub12) this.aClass218_21.method5096()) {
			if (local43 instanceof Class2_Sub12_Sub3) {
				@Pc(53) Class2_Sub12_Sub3 local53 = (Class2_Sub12_Sub3) local43;
				if (this.aString46.equals(local53.method4450())) {
					this.aClass2_Sub12_Sub3_2 = local53;
					return;
				}
			}
		}
	}
}
