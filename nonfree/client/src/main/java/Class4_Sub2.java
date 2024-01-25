import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "B")
	public byte aByte131;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "B")
	public byte aByte132;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "Z")
	public boolean aBoolean732;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!ov;")
	public Class4_Sub2 aClass4_Sub2_23;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
	public int anInt10228;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	public int anInt10229;

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
	public int anInt10231;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
	public int anInt10233;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
	public int anInt10234;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	public int anInt10235;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Z")
	public boolean aBoolean731 = false;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	protected Class4_Sub2() {
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8714(@OriginalArg(1) Class133 arg0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	public abstract void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)I")
	public int method8716() {
		return 0;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z")
	public abstract boolean method8717();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	public abstract Class200 method8720(@OriginalArg(0) Class133 arg0);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	public abstract Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0);

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "(I)Z")
	public abstract boolean method8722();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IILclient!ha;I)Z")
	public abstract boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2);

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V")
	public abstract void method8726();

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "(I)Z")
	public abstract boolean method8727();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([Lclient!vt;I)I")
	public abstract int method8729(@OriginalArg(0) Class5_Sub11[] arg0);

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "(I)I")
	protected abstract int method8730();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[Lclient!vt;I)I")
	protected final int method8731(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub11[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static26.aLongArrayArrayArray1[this.aByte132][arg0][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg1[local18++] = Static278.aClass174Array1[local28 - 1].aClass5_Sub11_2;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg1[local28] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!ha;I)V")
	public abstract void method8732(@OriginalArg(0) Class133 arg0);

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "(I)Z")
	public abstract boolean method8733();

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)I")
	public abstract int method8734();
}
