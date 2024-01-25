import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class325 {

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	private int anInt9409;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!vaa;)V")
	public Class325(@OriginalArg(0) Class349 arg0) {
		this.anInt9409 = 1;
		this.aLong244 = arg0.anInt10051;
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([Lclient!vaa;)V")
	public Class325(@OriginalArg(0) Class349[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7656(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lclient!vaa;")
	public Class349 method7652(@OriginalArg(1) int arg0) {
		return Static589.method8150(this.method7655(arg0));
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
	public int method7653() {
		return this.anInt9409;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
	private int method7655(@OriginalArg(1) int arg0) {
		return (int) (this.aLong244 >> arg0 * Static589.anInt10055) & 0xF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!vaa;)V")
	private void method7656(@OriginalArg(1) Class349 arg0) {
		this.aLong244 |= arg0.anInt10051 << this.anInt9409++ * Static589.anInt10055;
	}
}
