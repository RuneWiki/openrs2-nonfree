import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class355 {

	@OriginalMember(owner = "client!th", name = "K", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "Ljava/lang/Runnable;")
	public Runnable aRunnable2;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	public int anInt9927;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "I")
	public int anInt9928;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	public int anInt9929;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public int anInt9916 = 0;

	@OriginalMember(owner = "client!th", name = "S", descriptor = "Z")
	public boolean aBoolean723 = false;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
	public boolean aBoolean724 = true;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	public int anInt9925 = 0;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "I")
	public int anInt9923 = 0;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	public int anInt9922 = 0;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!nm;")
	public final Class181_Sub3 aClass181_Sub3_3 = new Class181_Sub3();

	@OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
	public final int[] anIntArray551 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "H", descriptor = "[I")
	public final int[] anIntArray554 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "P", descriptor = "[I")
	public final int[] anIntArray552 = new int[64];

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public final int[] anIntArray561 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "I", descriptor = "[Lclient!hma;")
	public final Class157_Sub1[] aClass157_Sub1Array3 = new Class157_Sub1[7];

	@OriginalMember(owner = "client!th", name = "M", descriptor = "[I")
	public final int[] anIntArray556 = new int[10];

	@OriginalMember(owner = "client!th", name = "L", descriptor = "[I")
	public final int[] anIntArray557 = new int[10];

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
	public final int[] anIntArray555 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
	public final int[] anIntArray553 = new int[8];

	@OriginalMember(owner = "client!th", name = "A", descriptor = "[I")
	public final int[] anIntArray563 = new int[10000];

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	public final int[] anIntArray562 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
	public final int[] anIntArray565 = new int[10];

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
	public final int[] anIntArray564 = new int[64];

	@OriginalMember(owner = "client!th", name = "U", descriptor = "[I")
	public final int[] anIntArray559 = new int[64];

	@OriginalMember(owner = "client!th", name = "b", descriptor = "[I")
	public final int[] anIntArray550 = new int[10];

	@OriginalMember(owner = "client!th", name = "G", descriptor = "[Lclient!hma;")
	public final Class157_Sub1[] aClass157_Sub1Array4 = new Class157_Sub1[7];

	@OriginalMember(owner = "client!th", name = "x", descriptor = "[I")
	public final int[] anIntArray568 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "z", descriptor = "[I")
	public final int[] anIntArray567 = new int[64];

	@OriginalMember(owner = "client!th", name = "N", descriptor = "[I")
	public final int[] anIntArray566 = new int[10000];

	@OriginalMember(owner = "client!th", name = "R", descriptor = "[F")
	public final float[] aFloatArray101 = new float[2];

	@OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
	public final int[] anIntArray558 = new int[8];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
	public final int[] anIntArray570 = new int[Static250.anInt4652];

	@OriginalMember(owner = "client!th", name = "F", descriptor = "[I")
	public final int[] anIntArray569 = new int[8];

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!rea;")
	private final Class67_Sub3 aClass67_Sub3_10;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	public int anInt9917;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!jp;")
	public Class192 aClass192_2;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "[I")
	public final int[] anIntArray560;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!rea;)V")
	public Class355(@OriginalArg(0) Class67_Sub3 arg0) {
		this.aClass67_Sub3_10 = arg0;
		this.anInt9917 = this.aClass67_Sub3_10.anInt9168 - 255;
		this.aClass192_2 = new Class192(arg0, this);
		for (@Pc(137) int local137 = 0; local137 < 7; local137++) {
			this.aClass157_Sub1Array4[local137] = new Class157_Sub1(this.aClass67_Sub3_10);
			this.aClass157_Sub1Array3[local137] = new Class157_Sub1(this.aClass67_Sub3_10);
		}
		this.anIntArray560 = new int[Static250.anInt4642];
		for (@Pc(169) int local169 = 0; local169 < Static250.anInt4642; local169++) {
			this.anIntArray560[local169] = -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	public void method8357(@OriginalArg(0) Runnable arg0) {
		this.aRunnable2 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method8360() {
		this.aClass192_2 = new Class192(this.aClass67_Sub3_10, this);
	}
}
