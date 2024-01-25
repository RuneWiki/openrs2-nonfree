import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public int anInt10355;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public int anInt10357;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "B")
	public byte aByte145;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public int anInt10358;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "B")
	public byte aByte146;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	public int anInt10360;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "Lclient!df;")
	public Class8_Sub1 aClass8_Sub1_23;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public int anInt10361;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	public int anInt10363;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
	public boolean aBoolean770;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
	public boolean aBoolean769 = false;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	protected Class8_Sub1() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!ha;B)Z")
	public abstract boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8896(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)Z")
	public abstract boolean method8897(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V")
	public abstract void method8898(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(B)Z")
	public abstract boolean method8899(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "(I)I")
	public abstract int method8900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	public abstract void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([Lclient!uf;Z)I")
	public abstract int method8902(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	public abstract Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(I)Z")
	public abstract boolean method8905();

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
	public abstract boolean method8906(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(ILclient!ha;)V")
	public abstract void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1);

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(I)I")
	public int method8908(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method8896(37, (Class57) null);
		}
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	public abstract Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([Lclient!uf;IIB)I")
	protected final int method8910(@OriginalArg(0) Class5_Sub43[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = Static63.aLongArrayArrayArray1[this.aByte145][arg1][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(30) int local30 = 0;
		@Pc(40) int local40;
		while (local16 <= 48L) {
			local40 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local40 <= 0) {
				break;
			}
			arg0[local30++] = Static252.aClass2Array1[local40 - 1].aClass5_Sub43_1;
			local16 += 16L;
		}
		for (local40 = local30; local40 < 4; local40++) {
			arg0[local40] = null;
		}
		return local30;
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "(I)I")
	protected abstract int method8911();
}
