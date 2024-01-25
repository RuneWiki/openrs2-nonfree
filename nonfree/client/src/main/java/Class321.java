import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class321 implements Interface22 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString104;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!kha;")
	private final Class181 aClass181_113;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!kha;Ljava/lang/String;)V")
	public Class321(@OriginalArg(0) Class181 arg0, @OriginalArg(1) String arg1) {
		this.aString104 = arg1;
		this.aClass181_113 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!am;")
	@Override
	public Class19 method8553() {
		return Static19.aClass19_3;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
	@Override
	public int method8554() {
		return this.aClass181_113.method5038(this.aString104) ? 100 : this.aClass181_113.method5036(this.aString104);
	}
}
