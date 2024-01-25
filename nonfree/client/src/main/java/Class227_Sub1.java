import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class227_Sub1 extends Class227 {

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public final int anInt5839;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILclient!lea;Lclient!taa;III)V")
	public Class227_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5839 = arg5;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static562.aClass390_11;
	}
}
