import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class37 {

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16384];

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16384];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!bo;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!pl;")
	public Class243 aClass243_3;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!fq;")
	public Class30_Sub5 aClass30_Sub5_1;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Z")
	public boolean aBoolean48;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!fba;")
	public Class30_Sub4 aClass30_Sub4_1;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Lclient!fa;")
	public Class30_Sub3 aClass30_Sub3_1;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Lclient!fba;")
	public Class30_Sub4 aClass30_Sub4_2;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "Lclient!we;")
	public Class30_Sub2 aClass30_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
	public boolean aBoolean49;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!we;")
	public Class30_Sub2 aClass30_Sub2_2;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "Lclient!hp;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "B")
	public byte aByte27 = 0;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "B")
	public byte aByte23;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray4[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray5[local15] = (float) Math.cos(local13 * (double) local15);
		}
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(III)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort30 = (short) arg1;
		this.aShort31 = (short) arg2;
		this.aByte23 = this.aByte22 = (byte) arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method850() {
		while (this.aClass243_3 != null) {
			@Pc(7) Class243 local7 = this.aClass243_3.aClass243_11;
			this.aClass243_3.method6032();
			this.aClass243_3 = local7;
		}
		this.aByte27 = 0;
	}
}
