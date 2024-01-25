import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
	public static final int[] anIntArray365;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public int anInt3965;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt3966;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt3967;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public int anInt3970;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	public int anInt3975;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public int anInt3976;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public int anInt3969 = 0;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	public int anInt3972 = -1;

	static {
		new Class34("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		anIntArray365 = new int[32];
		@Pc(49) int local49 = 2;
		for (@Pc(51) int local51 = 0; local51 < 32; local51++) {
			anIntArray365[local51] = local49 - 1;
			local49 += local49;
		}
	}
}
