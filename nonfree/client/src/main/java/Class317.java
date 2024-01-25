import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class317 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	private int anInt9315;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!qr;)V")
	public Class317(@OriginalArg(0) Class245 arg0) {
		this.aLong240 = arg0.anInt6944;
		this.anInt9315 = 1;
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([Lclient!qr;)V")
	public Class317(@OriginalArg(0) Class245[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method7857(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I")
	public int method7853() {
		return this.anInt9315;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!qr;)V")
	private void method7857(@OriginalArg(1) Class245 arg0) {
		this.aLong240 |= arg0.anInt6944 << Static397.anInt6950 * this.anInt9315++;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lclient!qr;")
	public Class245 method7858(@OriginalArg(0) int arg0) {
		return Static397.method5987()[this.method7859(arg0)];
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
	private int method7859(@OriginalArg(0) int arg0) {
		return (int) (this.aLong240 >> arg0 * Static397.anInt6950) & 0xF;
	}
}
