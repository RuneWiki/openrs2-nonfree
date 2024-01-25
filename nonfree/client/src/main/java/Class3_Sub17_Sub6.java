import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class3_Sub17_Sub6 extends Class3_Sub17 {

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
	private int anInt4557;

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2329(this.anInt4557, this.aLong157);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt4557 = arg0.method2036();
		this.aLong157 = arg0.method2063();
	}
}
