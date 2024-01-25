import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!lba;")
	public final Interface10 anInterface10_6;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!mj;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface10_6 = arg0.method5917(Static612.aClass244_15, false, arg1, arg3, arg2);
		this.anInterface10_6.method9107(false, false);
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!mj;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface10_6 = arg0.method5833(arg2, arg1, arg3, false);
		this.anInterface10_6.method9107(false, false);
	}
}
