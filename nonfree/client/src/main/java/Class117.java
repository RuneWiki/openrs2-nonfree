import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class117 implements Interface2 {

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public final int anInt3335;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
	public final int anInt3334;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
	public final int anInt3328;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
	public final int anInt3332;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public final int anInt3327;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "Lclient!vn;")
	public final Class347 aClass347_5;

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
	public final int anInt3336;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
	public final int anInt3333;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lclient!mf;")
	public final Class214 aClass214_6;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
	public final int anInt3331;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "Z")
	public final boolean aBoolean240;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(ILclient!vn;Lclient!mf;IIIIIIIZ)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt3335 = arg9;
		this.anInt3334 = arg8;
		this.anInt3328 = arg7;
		this.anInt3332 = arg3;
		this.anInt3327 = arg4;
		this.aClass347_5 = arg1;
		this.anInt3336 = arg6;
		this.anInt3333 = arg5;
		this.aClass214_6 = arg2;
		this.anInt3331 = arg0;
		this.aBoolean240 = arg10;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static418.aClass184_11;
	}
}
