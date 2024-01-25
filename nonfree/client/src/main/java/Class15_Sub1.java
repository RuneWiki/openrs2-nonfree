import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public abstract class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public int anInt10297;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "B")
	public byte aByte124;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public int anInt10298;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
	public int anInt10300;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "B")
	public byte aByte125;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Lclient!rr;")
	public Class15_Sub1 aClass15_Sub1_23;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public int anInt10301;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
	public int anInt10302;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
	public int anInt10304;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
	public boolean aBoolean742;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
	public boolean aBoolean741 = false;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	protected Class15_Sub1() {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!ha;I)Z")
	public abstract boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2);

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public abstract void method8317();

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	public abstract Class191 method8319(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Z")
	public abstract boolean method8320();

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)I")
	public int method8321() {
		return 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	public abstract void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Z")
	public abstract boolean method8324();

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z")
	public abstract boolean method8325();

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)I")
	public abstract int method8326();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ha;I)V")
	public abstract void method8327(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)Z")
	public abstract boolean method8328();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[Lclient!ada;)I")
	public abstract int method8329(@OriginalArg(1) Class8_Sub1[] arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[Lclient!ada;II)I")
	protected final int method8330(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static528.aLongArrayArrayArray1[this.aByte124][arg2][arg0];
		@Pc(24) long local24 = 0L;
		@Pc(26) int local26 = 0;
		@Pc(36) int local36;
		while (local24 <= 48L) {
			local36 = (int) (local14 >> (int) local24 & 0xFFFFL);
			if (local36 <= 0) {
				break;
			}
			local24 += 16L;
			arg1[local26++] = Static626.aClass204Array1[local36 - 1].aClass8_Sub1_3;
		}
		for (local36 = local26; local36 < 4; local36++) {
			arg1[local36] = null;
		}
		return local26;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	public abstract Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(I)Z")
	public abstract boolean method8332();

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(Z)I")
	public abstract int method8333(@OriginalArg(0) boolean arg0);
}
