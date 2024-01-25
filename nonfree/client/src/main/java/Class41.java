import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class41 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!vk;)V")
	public Class41(@OriginalArg(0) Class362 arg0) {
		this.anInt946 = 1;
		this.aLong31 = (long) arg0.anInt10081;
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "([Lclient!vk;)V")
	public Class41(@OriginalArg(0) Class362[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method909(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lclient!vk;")
	public Class362 method904(@OriginalArg(1) int arg0) {
		return Static610.method8508(this.method905(arg0));
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I")
	private int method905(@OriginalArg(0) int arg0) {
		return (int) (this.aLong31 >> Static610.anInt10084 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!vk;Z)V")
	private void method909(@OriginalArg(0) Class362 arg0) {
		this.aLong31 |= (long) (arg0.anInt10081 << this.anInt946++ * Static610.anInt10084);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I")
	public int method910() {
		return this.anInt946;
	}
}
