import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class85 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!bu;")
	private final Class32 aClass32_38;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public final int anInt2628;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class85(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		new Class126(64);
		this.aClass32_38 = arg2;
		this.anInt2628 = this.aClass32_38.method790(15);
	}
}
