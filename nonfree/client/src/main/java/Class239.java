import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class239 {

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
	public int anInt6107;

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "I")
	public int anInt6109;

	@OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
	public int anInt6096 = 0;

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
	public int anInt6100 = 0;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	public int anInt6099 = 0;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
	public int anInt6102 = 0;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "Lclient!ej;")
	public final Class58_Sub1 aClass58_Sub1_2 = new Class58_Sub1();

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "[I")
	public final int[] anIntArray450 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "S", descriptor = "[I")
	public final int[] anIntArray454 = new int[10];

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "[I")
	public final int[] anIntArray462 = new int[8];

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "[I")
	public final int[] anIntArray455 = new int[64];

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "[I")
	public final int[] anIntArray461 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "[I")
	public final int[] anIntArray456 = new int[10000];

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "[F")
	public final float[] aFloatArray43 = new float[2];

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "[Lclient!ib;")
	public final Class170_Sub1[] aClass170_Sub1Array3 = new Class170_Sub1[7];

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "[I")
	public final int[] anIntArray460 = new int[10000];

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
	public final int[] anIntArray449 = new int[10];

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "[I")
	public final int[] anIntArray451 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "[I")
	public final int[] anIntArray457 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "[I")
	public final int[] anIntArray464 = new int[64];

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "[I")
	public final int[] anIntArray465 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "[I")
	public final int[] anIntArray453 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "[I")
	public final int[] anIntArray448 = new int[10];

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "[I")
	public final int[] anIntArray458 = new int[64];

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "[I")
	public final int[] anIntArray459 = new int[64];

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "[I")
	public final int[] anIntArray452 = new int[8];

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "[I")
	public final int[] anIntArray467 = new int[10];

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "[Lclient!ib;")
	public final Class170_Sub1[] aClass170_Sub1Array4 = new Class170_Sub1[7];

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "[I")
	public final int[] anIntArray466 = new int[Static264.anInt4124];

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "[I")
	public final int[] anIntArray468 = new int[8];

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "Lclient!wda;")
	private final Class22_Sub3 aClass22_Sub3_6;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public int anInt6098;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "Lclient!ht;")
	public Class166 aClass166_2;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!wda;)V")
	public Class239(@OriginalArg(0) Class22_Sub3 arg0) {
		this.aClass22_Sub3_6 = arg0;
		this.anInt6098 = this.aClass22_Sub3_6.anInt11035 - 255;
		this.aClass166_2 = new Class166(arg0, this);
		for (@Pc(137) int local137 = 0; local137 < 7; local137++) {
			this.aClass170_Sub1Array3[local137] = new Class170_Sub1(this.aClass22_Sub3_6);
			this.aClass170_Sub1Array4[local137] = new Class170_Sub1(this.aClass22_Sub3_6);
		}
		this.anIntArray463 = new int[Static264.anInt4121];
		for (@Pc(171) int local171 = 0; local171 < Static264.anInt4121; local171++) {
			this.anIntArray463[local171] = -1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public void method5319() {
		this.aClass166_2 = new Class166(this.aClass22_Sub3_6, this);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/Runnable;)V")
	public void method5322(@OriginalArg(1) Runnable arg0) {
		this.aRunnable2 = arg0;
	}
}
