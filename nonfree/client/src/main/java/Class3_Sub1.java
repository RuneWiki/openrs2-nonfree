import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
	public int anInt9914;

	@OriginalMember(owner = "client!gda", name = "n", descriptor = "Z")
	public boolean aBoolean770;

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "B")
	public byte aByte141;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
	public int anInt9915;

	@OriginalMember(owner = "client!gda", name = "r", descriptor = "B")
	public byte aByte142;

	@OriginalMember(owner = "client!gda", name = "t", descriptor = "I")
	public int anInt9917;

	@OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
	public int anInt9920;

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
	public int anInt9921;

	@OriginalMember(owner = "client!gda", name = "C", descriptor = "Lclient!gda;")
	public Class3_Sub1 aClass3_Sub1_23;

	@OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
	public int anInt9925;

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "Z")
	public boolean aBoolean771 = false;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	protected Class3_Sub1() {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBILclient!ha;)Z")
	public abstract boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method8490(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	public abstract void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(Lclient!ha;I)V")
	public abstract void method8492(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(Z)I")
	public int method8493() {
		return 0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB[Lclient!kp;)I")
	protected final int method8494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub29[] arg2) {
		@Pc(14) long local14 = Static432.aLongArrayArrayArray1[this.aByte141][arg1][arg0];
		@Pc(16) long local16 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local16 <= 48L) {
			local33 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			arg2[local23++] = Static217.aClass85Array1[local33 - 1].aClass4_Sub29_2;
			local16 += 16L;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg2[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)I")
	public abstract int method8495(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B[Lclient!kp;)I")
	public abstract int method8498(@OriginalArg(1) Class4_Sub29[] arg0);

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)I")
	public abstract int method8499();

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(Z)Z")
	public abstract boolean method8500();

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)Z")
	public abstract boolean method8501();

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	public abstract Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0);

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "(I)Z")
	public abstract boolean method8503();

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(Z)V")
	public abstract void method8504();

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(Z)Z")
	public abstract boolean method8505();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	public abstract Class261 method8507(@OriginalArg(1) Class33 arg0);
}
