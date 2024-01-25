import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class354 implements Interface14 {

	@OriginalMember(owner = "client!un", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_152;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString114;

	static {
		new Class223("", 76);
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!aj;Ljava/lang/String;)V")
	public Class354(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1) {
		this.aClass15_152 = arg0;
		this.aString114 = arg1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Lclient!jq;")
	@Override
	public Class174 method8680() {
		return Static286.aClass174_4;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
	@Override
	public int method8681() {
		return this.aClass15_152.method532(this.aString114) ? 100 : this.aClass15_152.method538(this.aString114);
	}
}
