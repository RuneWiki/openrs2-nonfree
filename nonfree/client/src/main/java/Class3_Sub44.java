import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public abstract class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "Z")
	public boolean aBoolean671;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!dw;")
	protected final Class82_Sub1 aClass82_Sub1_39;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class3_Sub44(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
	public final int method7731() {
		return 1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Z")
	public final boolean method7732() {
		return this.aBoolean671;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7733();

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	public abstract void method7734();

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)V")
	public abstract void method7736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(Z)I")
	public int method7737() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)Z")
	public final boolean method7738() {
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
	public abstract void method7739(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z")
	public abstract boolean method7740();

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!fba;ILclient!fba;I)V")
	public abstract void method7741(@OriginalArg(0) Class94_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class94_Sub2 arg2);
}
