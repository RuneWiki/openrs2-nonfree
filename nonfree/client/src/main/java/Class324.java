import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class324 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public int anInt8959;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt8960;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	public int anInt8961;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public int anInt8962;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class324() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!sj;)V")
	public Class324(@OriginalArg(0) Class324 arg0) {
		this.anInt8959 = arg0.anInt8959;
		this.anInt8961 = arg0.anInt8961;
		this.anInt8960 = arg0.anInt8960;
		this.anInt8962 = arg0.anInt8962;
	}
}
