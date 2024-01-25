import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "[I")
	public static final int[] anIntArray478 = new int[128];

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "Lclient!td;")
	private Class24 aClass24_25;

	static {
		@Pc(8) int local8;
		for (local8 = 0; local8 < anIntArray478.length; local8++) {
			anIntArray478[local8] = -1;
		}
		for (@Pc(24) int local24 = 65; local24 <= 90; local24++) {
			anIntArray478[local24] = local24 - 65;
		}
		for (@Pc(39) int local39 = 97; local39 <= 122; local39++) {
			anIntArray478[local39] = local39 + 26 - 97;
		}
		for (@Pc(54) int local54 = 48; local54 <= 57; local54++) {
			anIntArray478[local54] = local54 + 52 - 48;
		}
		anIntArray478[42] = anIntArray478[43] = 62;
		anIntArray478[45] = anIntArray478[47] = 63;
		aRectangleArray2 = new Rectangle[100];
		for (local8 = 0; local8 < 100; local8++) {
			aRectangleArray2[local8] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!bh;)V")
	public Class10_Sub2(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class6_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static323.aClass5_9.method7506(arg0 - 2, arg1, super.aClass6_5.anInt2440 + 4, super.aClass6_5.anInt2436 + 2, ((Class6_Sub1) super.aClass6_5).anInt1274, 0);
		Static323.aClass5_9.method7506(arg0 - 1, arg1 + 1, super.aClass6_5.anInt2440 + 2, super.aClass6_5.anInt2436, 0, 0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
		super.method8396();
		this.aClass24_25 = Static128.method2506(super.aClass196_127, ((Class6_Sub1) super.aClass6_5).anInt1277);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method8401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method8402() * super.aClass6_5.anInt2440 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static323.aClass5_9.K(local16);
		Static323.aClass5_9.KA(arg1, arg0 + 2, local13 + arg1, super.aClass6_5.anInt2436 + arg0);
		this.aClass24_25.method8571(arg1, arg0 + 2, super.aClass6_5.anInt2440, super.aClass6_5.anInt2436);
		Static323.aClass5_9.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		return super.method8398() ? super.aClass196_127.method5111(((Class6_Sub1) super.aClass6_5).anInt1277) : false;
	}
}
