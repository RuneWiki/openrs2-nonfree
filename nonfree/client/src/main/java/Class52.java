import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class52 implements Interface18 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString14;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!wia;")
	private final Class386 aClass386_17;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!wia;Ljava/lang/String;)V")
	public Class52(@OriginalArg(0) Class386 arg0, @OriginalArg(1) String arg1) {
		this.aString14 = arg1;
		this.aClass386_17 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	@Override
	public int method9016() {
		return this.aClass386_17.method9185(this.aString14) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lclient!lj;")
	@Override
	public Class214 method9015() {
		return Static336.aClass214_2;
	}
}
