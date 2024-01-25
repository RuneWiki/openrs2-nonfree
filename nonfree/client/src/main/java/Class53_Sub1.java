import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class53_Sub1 extends Class53 implements Interface23 {

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!nv;I[BI)V")
	public Class53_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5000 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)J")
	@Override
	public long method5437() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5438(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method6285(arg0, arg1);
		this.anInt5000 = 5123;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)I")
	@Override
	public int method5439() {
		return this.anInt5000;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)I")
	@Override
	public int method5436() {
		return 0;
	}
}
