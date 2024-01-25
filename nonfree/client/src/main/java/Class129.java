import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class129 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!m;")
	public Class22 aClass22_7;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!ia;")
	public Class129 aClass129_2;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public final int anInt4062;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public final int anInt4066;

	static {
		new Class114(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4062 = arg1;
		this.anInt4066 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!ia;I)V")
	public Class129(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1) {
		this.aClass129_2 = arg0;
		this.anInt4062 = this.aClass129_2.anInt4062 + arg1;
		this.anInt4066 = this.aClass129_2.anInt4066;
		this.aClass22_7 = this.aClass129_2.aClass22_7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lclient!ia;")
	public Class129 method3625(@OriginalArg(1) int arg0) {
		return new Class129(this.anInt4066, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lclient!vda;")
	public Class302 method3626() {
		return Static153.method3116(this.anInt4066);
	}
}
