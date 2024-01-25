import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public final int anInt2192;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILclient!og;Lclient!gi;III)V")
	public Class89_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2192 = arg5;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static158.aClass108_6;
	}
}
