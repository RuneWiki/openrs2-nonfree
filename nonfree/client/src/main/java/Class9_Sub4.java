import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public abstract class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
	public boolean aBoolean815;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
	public int anInt10357;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	public int anInt10358;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "B")
	public byte aByte134;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public int anInt10359;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public int anInt10360;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public int anInt10362;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "B")
	public byte aByte135;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	public int anInt10365;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "Lclient!gg;")
	public Class9_Sub4 aClass9_Sub4_23;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Z")
	public boolean aBoolean816 = false;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	protected Class9_Sub4() {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	public abstract Class243 method8409(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	public abstract Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ha;BI)Z")
	public abstract boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method8412(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Z")
	public abstract boolean method8413();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Lclient!cba;)I")
	public abstract int method8415(@OriginalArg(1) Class6_Sub10[] arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	public abstract void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)Z")
	public abstract boolean method8417();

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)I")
	public abstract int method8420(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
	public int method8421() {
		return 0;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Z")
	public abstract boolean method8422();

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Lclient!ha;I)V")
	public abstract void method8423(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ[Lclient!cba;I)I")
	protected final int method8424(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub10[] arg1, @OriginalArg(3) int arg2) {
		@Pc(21) long local21 = Static531.aLongArrayArrayArray1[this.aByte135][arg0][arg2];
		@Pc(23) long local23 = 0L;
		@Pc(25) int local25 = 0;
		@Pc(35) int local35;
		while (local23 <= 48L) {
			local35 = (int) (local21 >> (int) local23 & 0xFFFFL);
			if (local35 <= 0) {
				break;
			}
			local23 += 16L;
			arg1[local25++] = Static489.aClass3Array1[local35 - 1].aClass6_Sub10_1;
		}
		for (local35 = local25; local35 < 4; local35++) {
			arg1[local35] = null;
		}
		return local25;
	}

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)I")
	public abstract int method8425();

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(Z)Z")
	public abstract boolean method8426();

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V")
	public abstract void method8427();
}
