import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class12_Sub1_Sub5 extends Class12_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!rt", name = "W", descriptor = "Lclient!ja;")
	public final Class120 aClass120_4;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "Z")
	private final boolean aBoolean437;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIZIIIIIII)V")
	public Class12_Sub1_Sub5(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt815 == 1, Static14.method432(arg13, arg12));
		this.aClass120_4 = new Class120(arg0, arg1, arg12, arg13, super.aByte74, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean437 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aClass120_4.anInt2922;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_4.method2677(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aClass120_4.anInt2929;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aClass120_4.method2679();
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_4.method2677(super.anInt6317, true, true, super.anInt6328, arg0, 131072);
		if (local16 != null) {
			this.aClass120_4.method2683(super.aShort97, super.aShort96, super.aShort95, arg0, super.aShort94, local16, false);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		this.aClass120_4.method2678(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		this.aClass120_4.method2686(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return this.aClass120_4.method2681();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3 local16 = this.aClass120_4.method2677(super.anInt6317, false, false, super.anInt6328, arg0, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class54 local23 = arg0.method4556();
			local23.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
			return local16.method3444(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aClass120_4.anInt2942;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_4.method2677(super.anInt6317, false, true, super.anInt6328, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class54 local23 = arg0.method4556();
		local23.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
		@Pc(33) Class22_Sub8 local33 = null;
		if (this.aBoolean437) {
			local33 = Static128.method2279(1);
		}
		if (this.aClass120_4.aClass22_Sub6_3 == null) {
			local16.method3443(local23, local33 == null ? null : local33.aClass22_Sub1Array1[0], 0);
		} else {
			@Pc(49) Class157 local49 = this.aClass120_4.aClass22_Sub6_3.method3555();
			arg0.method4485(local16, local49, local23, local33 == null ? null : local33.aClass22_Sub1Array1[0]);
		}
		this.aClass120_4.method2683(super.aShort97, super.aShort96, super.aShort95, arg0, super.aShort94, local16, true);
		return local33;
	}
}
