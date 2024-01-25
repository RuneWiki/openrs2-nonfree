import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public abstract class Class13_Sub1_Sub4 extends Class13_Sub1 {

	@OriginalMember(owner = "client!fw", name = "C", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIII)V")
	protected Class13_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10089 = arg2;
		super.anInt10097 = arg1;
		super.aByte127 = (byte) arg3;
		super.anInt10090 = arg0;
		this.aShort122 = (short) arg5;
		super.aByte126 = (byte) arg4;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I[Lclient!kb;)I")
	@Override
	public final int method8401(@OriginalArg(1) Class2_Sub24[] arg0) {
		@Pc(10) int local10 = super.anInt10090 >> Static609.anInt9827;
		@Pc(15) int local15 = super.anInt10089 >> Static609.anInt9827;
		@Pc(25) int local25 = 0;
		if (local10 == Static566.anInt9234) {
			local25++;
		} else if (local10 > Static566.anInt9234) {
			local25 += 2;
		}
		if (local15 == Static370.anInt5837) {
			local25 += 3;
		} else if (local15 < Static370.anInt5837) {
			local25 += 6;
		}
		@Pc(61) int local61 = Static317.anIntArray347[local25];
		if ((this.aShort122 & local61) != 0) {
			return this.method8398(local15, arg0, local10);
		} else if (this.aShort122 == 1 && local10 > 0) {
			return this.method8398(local15, arg0, local10 - 1);
		} else if (this.aShort122 == 4 && Static322.anInt5120 >= local10) {
			return this.method8398(local15, arg0, local10 + 1);
		} else if (this.aShort122 == 8 && local15 > 0) {
			return this.method8398(local15 - 1, arg0, local10);
		} else if (this.aShort122 == 2 && local15 <= Class13_Sub1_Sub4_Sub1.lb) {
			return this.method8398(local15 + 1, arg0, local10);
		} else if (this.aShort122 == 16 && local10 > 0 && Class13_Sub1_Sub4_Sub1.lb >= local15) {
			return this.method8398(local15 + 1, arg0, local10 - 1);
		} else if (this.aShort122 == 32 && local10 <= Static322.anInt5120 && Class13_Sub1_Sub4_Sub1.lb >= local15) {
			return this.method8398(local15 + 1, arg0, local10 + 1);
		} else if (this.aShort122 == 128 && local10 > 0 && local15 > 0) {
			return this.method8398(local15 - 1, arg0, local10 - 1);
		} else if (this.aShort122 == 64 && local10 <= Static322.anInt5120 && local15 > 0) {
			return this.method8398(local15 - 1, arg0, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8403() {
		return Static494.aBooleanArrayArray8[Static335.anInt5343 + (super.anInt10090 >> Static609.anInt9827) - Static566.anInt9234][(super.anInt10089 >> Static609.anInt9827) + Static335.anInt5343 - Static370.anInt5837];
	}

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8406() {
		return Static298.method4105(super.anInt10089 >> Static609.anInt9827, super.aByte126, this, super.anInt10090 >> Static609.anInt9827);
	}
}
