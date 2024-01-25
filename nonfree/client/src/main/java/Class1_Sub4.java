import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public int anInt9932;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public int anInt9934;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
	public int anInt9935;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "B")
	public byte aByte126;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public int anInt9937;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public int anInt9938;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	public int anInt9939;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Z")
	public boolean aBoolean697;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	protected Class1_Sub4() {
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Z")
	public abstract boolean method8114();

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z")
	public abstract boolean method8115();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;III)Z")
	public abstract boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
	public abstract int method8117();

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z")
	public abstract boolean method8118();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lclient!ul;III)I")
	protected final int method8119(@OriginalArg(0) Class4_Sub24[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static461.aLongArrayArrayArray1[this.aByte126][arg2][arg1];
		@Pc(22) long local22 = 0L;
		@Pc(24) int local24 = 0;
		@Pc(34) int local34;
		while (local22 <= 48L) {
			local34 = (int) (local14 >> (int) local22 & 0xFFFFL);
			if (local34 <= 0) {
				break;
			}
			local22 += 16L;
			arg0[local24++] = Static485.aClass177Array1[local34 - 1].aClass4_Sub24_1;
		}
		for (local34 = local24; local34 < 4; local34++) {
			arg0[local34] = null;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	public abstract void method8120();

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	public abstract Class308 method8121(@OriginalArg(1) Class44 arg0);

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)I")
	public abstract int method8123(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;Z)V")
	public abstract void method8124(@OriginalArg(0) Class44 arg0);

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "(I)Z")
	public abstract boolean method8126();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	public abstract void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)Z")
	public abstract boolean method8128();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lclient!ul;I)I")
	public abstract int method8129(@OriginalArg(0) Class4_Sub24[] arg0);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	public abstract Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0);
}
