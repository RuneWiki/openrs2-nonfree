import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class3_Sub10_Sub6 extends Class3_Sub10 {

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "[Lclient!mc;")
	public Class189[] aClass189Array1;

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
	private final int anInt3159;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub10_Sub6(@OriginalArg(0) int arg0) {
		this.anInt3159 = arg0;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)Z")
	public boolean method2658(@OriginalArg(1) int arg0) {
		return this.aClass189Array1[arg0].aBoolean378;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(II)Z")
	public boolean method2659(@OriginalArg(0) int arg0) {
		return this.aClass189Array1[arg0].aBoolean379;
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(II)Z")
	public boolean method2660(@OriginalArg(1) int arg0) {
		return this.aClass189Array1[arg0].aBoolean377;
	}

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "(I)Z")
	public boolean method2663() {
		if (this.aClass189Array1 != null) {
			return true;
		}
		@Pc(36) int local36;
		if (this.aByteArrayArray10 == null) {
			if (!Static390.aClass161_88.method4269(this.anInt3159)) {
				return false;
			}
			@Pc(29) int[] local29 = Static390.aClass161_88.method4242(this.anInt3159);
			this.aByteArrayArray10 = new byte[local29.length][];
			for (local36 = 0; local36 < local29.length; local36++) {
				this.aByteArrayArray10[local36] = Static390.aClass161_88.method4243(local29[local36], this.anInt3159);
			}
		}
		@Pc(57) boolean local57 = true;
		for (local36 = 0; local36 < this.aByteArrayArray10.length; local36++) {
			@Pc(66) byte[] local66 = this.aByteArrayArray10[local36];
			@Pc(71) Class3_Sub27 local71 = new Class3_Sub27(local66);
			local71.anInt9191 = 1;
			@Pc(78) int local78 = local71.method7591();
			local57 &= Static499.aClass161_38.method4268(local78);
		}
		if (!local57) {
			return false;
		}
		@Pc(104) Class71 local104 = new Class71();
		@Pc(110) int local110 = Static390.aClass161_88.method4266(this.anInt3159);
		this.aClass189Array1 = new Class189[local110];
		@Pc(120) int[] local120 = Static390.aClass161_88.method4242(this.anInt3159);
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			@Pc(129) byte[] local129 = this.aByteArrayArray10[local122];
			@Pc(134) Class3_Sub27 local134 = new Class3_Sub27(local129);
			local134.anInt9191 = 1;
			@Pc(143) int local143 = local134.method7591();
			@Pc(145) Class3_Sub45 local145 = null;
			for (@Pc(150) Class3_Sub45 local150 = (Class3_Sub45) local104.method2089(); local150 != null; local150 = (Class3_Sub45) local104.method2086()) {
				if (local150.anInt8245 == local143) {
					local145 = local150;
					break;
				}
			}
			if (local145 == null) {
				local145 = new Class3_Sub45(local143, Static499.aClass161_38.method4265(local143));
				local104.method2076(local145);
			}
			this.aClass189Array1[local120[local122]] = new Class189(local129, local145);
		}
		this.aByteArrayArray10 = null;
		return true;
	}
}
