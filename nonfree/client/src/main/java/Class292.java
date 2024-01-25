import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class292 implements Interface3 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public final int anInt7541;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
	public Class292(@OriginalArg(0) int arg0) {
		this.anInt7541 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static428.aClass392_5;
	}
}
