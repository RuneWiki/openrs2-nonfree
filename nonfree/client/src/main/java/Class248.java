import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class248 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!he;")
	private final Class100 aClass100_90;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	public final int anInt7379;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class248(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		new Class44(64);
		this.aClass100_90 = arg2;
		this.anInt7379 = this.aClass100_90.method2523(15);
	}
}
