import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	public final int anInt4706;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILclient!nha;Lclient!jn;III)V")
	public Class177_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4706 = arg5;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static76.aClass365_4;
	}
}
