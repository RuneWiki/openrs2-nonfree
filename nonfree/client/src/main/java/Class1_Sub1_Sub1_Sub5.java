import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
	public int anInt2205;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		return Static74.method1334(this.anInt2208).method1333(this.anInt2205);
	}
}
