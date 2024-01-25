import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public abstract class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "B")
	public byte aByte142;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public int anInt10105;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public int anInt10106;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public int anInt10107;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	public int anInt10108;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public int anInt10109;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Z")
	public boolean aBoolean744;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "B")
	public byte aByte143;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	public int anInt10114;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "Lclient!cn;")
	public Class23_Sub2 aClass23_Sub2_23;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Z")
	public boolean aBoolean743 = false;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	protected Class23_Sub2() {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLclient!ha;)V")
	public abstract void method8590(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	public abstract void method8592();

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)Z")
	public abstract boolean method8594();

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	public abstract Class77 method8595(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	public abstract void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)Z")
	public abstract boolean method8598();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8599(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ha;III)Z")
	public abstract boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)I")
	public abstract int method8601();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([Lclient!bq;Z)I")
	public abstract int method8602(@OriginalArg(0) Class3_Sub7[] arg0);

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	public abstract Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)I")
	public int method8605() {
		return 0;
	}

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)I")
	public abstract int method8606(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)Z")
	public abstract boolean method8607();

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "(I)Z")
	public abstract boolean method8608();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[Lclient!bq;)I")
	protected final int method8609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7[] arg2) {
		@Pc(19) long local19 = Static71.aLongArrayArrayArray1[this.aByte142][arg1][arg0];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local19 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			arg2[local23++] = Static135.aClass119Array1[local33 - 1].aClass3_Sub7_1;
			local21 += 16L;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg2[local33] = null;
		}
		return local23;
	}
}
