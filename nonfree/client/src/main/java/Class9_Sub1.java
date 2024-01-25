import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "B")
	public byte aByte125;

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
	public int anInt8974;

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
	public int anInt8975;

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
	public int anInt8976;

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
	public int anInt8977;

	@OriginalMember(owner = "client!gfa", name = "q", descriptor = "Z")
	public boolean aBoolean702;

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
	public int anInt8978;

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "B")
	public byte aByte126;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
	public int anInt8980;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	protected Class9_Sub1() {
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([Lclient!ff;B)I")
	public abstract int method7468(@OriginalArg(0) Class3_Sub22[] arg0);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	public abstract Class29 method7469(@OriginalArg(1) Class43 arg0);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[Lclient!ff;II)I")
	protected final int method7470(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static548.aLongArrayArrayArray1[this.aByte126][arg2][arg0];
		@Pc(26) long local26 = 0L;
		@Pc(28) int local28 = 0;
		@Pc(38) int local38;
		while (local26 <= 48L) {
			local38 = (int) (local14 >> (int) local26 & 0xFFFFL);
			if (local38 <= 0) {
				break;
			}
			local26 += 16L;
			arg1[local28++] = Static569.aClass258Array1[local38 - 1].aClass3_Sub22_2;
		}
		for (local38 = local28; local38 < 4; local38++) {
			arg1[local38] = null;
		}
		return local28;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLclient!r;)V")
	public abstract void method7471(@OriginalArg(1) Class43 arg0);

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)Z")
	public abstract boolean method7473();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!r;BII)Z")
	public abstract boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7475();

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)V")
	public abstract void method7477();

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "(I)I")
	public abstract int method7478();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	public abstract void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	public abstract Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0);

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "(B)Z")
	public abstract boolean method7481();

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(Z)I")
	public abstract int method7482(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)Z")
	public abstract boolean method7483();

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "(B)Z")
	public abstract boolean method7484();
}
