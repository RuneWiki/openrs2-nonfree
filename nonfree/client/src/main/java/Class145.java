import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class145 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!lh;")
	public Class145 aClass145_2;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public int anInt3633;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!de;")
	public Class44 aClass44_3;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public final int anInt3632;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public final int anInt3634;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3632 = arg1;
		this.anInt3634 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!lh;I)V")
	public Class145(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		this.aClass145_2 = arg0;
		this.anInt3634 = this.aClass145_2.anInt3634;
		this.aClass44_3 = this.aClass145_2.aClass44_3;
		this.anInt3632 = this.aClass145_2.anInt3632 + arg1;
	}
}
