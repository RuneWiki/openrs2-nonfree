import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "Z")
	public boolean aBoolean689;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "Lclient!ep;")
	protected final Class95_Sub1 aClass95_Sub1_41;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class2_Sub15(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	public int method7778() {
		return 0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZI)V")
	public abstract void method7779(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)Z")
	public final boolean method7781() {
		return this.aBoolean689;
	}

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "(I)I")
	public final int method7783() {
		return 1;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)Z")
	public final boolean method7784() {
		return false;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
	public abstract void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "(I)Z")
	public abstract boolean method7786();

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "(I)V")
	public abstract void method7788();

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "(I)Z")
	public abstract boolean method7789();

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!fq;ILclient!fq;B)V")
	public abstract void method7790(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65_Sub1 arg2);
}
