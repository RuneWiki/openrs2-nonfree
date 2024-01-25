import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class150 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Lclient!rw;")
	public Class2_Sub46 aClass2_Sub46_3;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Lclient!ws;")
	public Class2_Sub26_Sub5 aClass2_Sub26_Sub5_3;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!gb;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Lclient!ud;")
	public Class2_Sub44_Sub1 aClass2_Sub44_Sub1_3;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public final int anInt4622;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	public int anInt4618;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public final int anInt4624;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	public final int anInt4617;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public final int anInt4619;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!nfa;")
	public final Class15_Sub3 aClass15_Sub3_13;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(BIIIIIILclient!nfa;)V")
	public Class150(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class15_Sub3 arg7) {
		this.anInt4622 = arg6;
		this.anInt4618 = arg3;
		this.anInt4624 = arg2;
		this.anInt4620 = arg5;
		this.aByte74 = arg0;
		this.anInt4617 = arg4;
		this.anInt4619 = arg1;
		this.aClass15_Sub3_13 = arg7;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Z")
	public boolean method4174() {
		return this.aByte74 == 2 || this.aByte74 == 3;
	}
}
