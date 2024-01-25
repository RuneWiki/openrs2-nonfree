import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class3_Sub7_Sub18 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "[Lclient!mp;")
	public Class225[] aClass225Array1;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	private final int anInt8430;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub18(@OriginalArg(0) int arg0) {
		this.anInt8430 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Z")
	public boolean method7263() {
		if (this.aClass225Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray21 == null) {
			@Pc(15) Class343 local15 = Static12.aClass343_14;
			synchronized (Static12.aClass343_14) {
				if (!Static12.aClass343_14.method8146(this.anInt8430)) {
					return false;
				}
				local35 = Static12.aClass343_14.method8145(this.anInt8430);
				this.aByteArrayArray21 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray21[local42] = Static12.aClass343_14.method8132(this.anInt8430, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray21.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray21[local75];
			@Pc(87) Class3_Sub9 local87 = new Class3_Sub9(local82);
			local87.anInt6453 = 1;
			local42 = local87.method5610();
			@Pc(96) Class343 local96 = Static226.aClass343_114;
			synchronized (Static226.aClass343_114) {
				local73 &= Static226.aClass343_114.method8138(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(129) Class216 local129 = new Class216();
		@Pc(131) Class343 local131 = Static12.aClass343_14;
		synchronized (Static12.aClass343_14) {
			@Pc(139) int local139 = Static12.aClass343_14.method8157(this.anInt8430);
			this.aClass225Array1 = new Class225[local139];
			local35 = Static12.aClass343_14.method8145(this.anInt8430);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray21[local42];
			@Pc(169) Class3_Sub9 local169 = new Class3_Sub9(local164);
			local169.anInt6453 = 1;
			@Pc(176) int local176 = local169.method5610();
			@Pc(178) Class3_Sub15 local178 = null;
			for (@Pc(183) Class3_Sub15 local183 = (Class3_Sub15) local129.method5457(); local183 != null; local183 = (Class3_Sub15) local129.method5458()) {
				if (local176 == local183.anInt2693) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(203) Class343 local203 = Static226.aClass343_114;
				synchronized (Static226.aClass343_114) {
					local178 = new Class3_Sub15(local176, Static226.aClass343_114.method8143(local176));
				}
				local129.method5449(local178);
			}
			this.aClass225Array1[local35[local42]] = new Class225(local164, local178);
		}
		this.aByteArrayArray21 = null;
		return true;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)Z")
	public boolean method7266(@OriginalArg(0) int arg0) {
		return this.aClass225Array1[arg0].aBoolean479;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
	public boolean method7267(@OriginalArg(0) int arg0) {
		return this.aClass225Array1[arg0].aBoolean480;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z")
	public boolean method7270(@OriginalArg(0) int arg0) {
		return this.aClass225Array1[arg0].aBoolean481;
	}
}
