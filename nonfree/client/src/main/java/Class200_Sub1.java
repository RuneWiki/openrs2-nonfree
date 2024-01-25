import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "Lclient!gn;")
	public final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!qq;II[B)V")
	public Class200_Sub1(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface8_5 = arg0.method6217(Static257.aClass297_6, arg1, arg3, false, arg2);
		this.anInterface8_5.method7331(false, false);
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!qq;II[I)V")
	public Class200_Sub1(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface8_5 = arg0.method6229(arg2, false, arg1, arg3);
		this.anInterface8_5.method7331(false, false);
	}
}
