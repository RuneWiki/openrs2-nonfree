import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class303 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!kda;")
	private final Class160 aClass160_98;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public final int anInt8625;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class303(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		new Class316(64);
		this.aClass160_98 = arg2;
		this.anInt8625 = this.aClass160_98.method4207(15);
	}
}
