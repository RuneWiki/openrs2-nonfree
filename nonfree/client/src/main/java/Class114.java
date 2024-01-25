import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class114 implements Interface18 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!wia;")
	private final Class386 aClass386_39;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString43;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!wia;Ljava/lang/String;)V")
	public Class114(@OriginalArg(0) Class386 arg0, @OriginalArg(1) String arg1) {
		this.aClass386_39 = arg0;
		this.aString43 = arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Lclient!lj;")
	@Override
	public Class214 method9015() {
		return Static336.aClass214_3;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)I")
	@Override
	public int method9016() {
		return this.aClass386_39.method9194(this.aString43) ? 100 : this.aClass386_39.method9191(this.aString43);
	}
}
