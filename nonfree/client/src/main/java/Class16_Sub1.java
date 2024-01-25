import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public abstract class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
	public int anInt8031;

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "Lclient!rba;")
	public Class16_Sub1 aClass16_Sub1_23;

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "B")
	public byte aByte108;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "B")
	public byte aByte109;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
	public int anInt8034;

	@OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
	public int anInt8035;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "Z")
	public boolean aBoolean583;

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
	public int anInt8036;

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
	public int anInt8037;

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
	public int anInt8039;

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "Z")
	public boolean aBoolean582 = false;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V")
	protected Class16_Sub1() {
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(III[Lclient!laa;)I")
	protected final int method6973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub12[] arg2) {
		@Pc(22) long local22 = Static573.aLongArrayArrayArray1[this.aByte109][arg0][arg1];
		@Pc(24) long local24 = 0L;
		@Pc(26) int local26 = 0;
		@Pc(36) int local36;
		while (local24 <= 48L) {
			local36 = (int) (local22 >> (int) local24 & 0xFFFFL);
			if (local36 <= 0) {
				break;
			}
			local24 += 16L;
			arg2[local26++] = Static547.aClass342Array1[local36 - 1].aClass2_Sub12_1;
		}
		for (local36 = local26; local36 < 4; local36++) {
			arg2[local36] = null;
		}
		return local26;
	}

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)Z")
	public abstract boolean method6974();

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(B)I")
	public int method6975() {
		return 0;
	}

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(I)Z")
	public abstract boolean method6976();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([Lclient!laa;Z)I")
	public abstract int method6977(@OriginalArg(0) Class2_Sub12[] arg0);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ha;I)V")
	public abstract void method6978(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method6979(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(B)I")
	public abstract int method6980();

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(B)Z")
	public abstract boolean method6982();

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	public abstract Class379 method6983(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	public abstract void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BILclient!ha;I)Z")
	public abstract boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "(B)V")
	public abstract void method6987();

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "(I)I")
	public abstract int method6988(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "(B)Z")
	public abstract boolean method6990();

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	public abstract Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0);
}
