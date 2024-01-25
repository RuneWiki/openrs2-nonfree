import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class104 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public int anInt3205;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public int anInt3207;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	private int anInt3208;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!jm;")
	public Class133 aClass133_2;

	static {
		new Class158("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ia;)V")
	public void method2374(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method2377(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lclient!wh;")
	public synchronized Class266 method2375() {
		@Pc(13) Class266 local13 = (Class266) this.aClass133_2.aClass91_57.method1988((long) this.anInt3208);
		if (local13 != null) {
			return local13;
		}
		local13 = Static470.method6054(this.aClass133_2.aClass211_52, this.anInt3208, 0);
		if (local13 != null) {
			this.aClass133_2.aClass91_57.method1990(local13, (long) this.anInt3208);
		}
		return local13;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BILclient!ia;)V")
	private void method2377(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt3208 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt3207 = arg1.method1171();
			this.anInt3205 = arg1.method1171();
		}
	}
}
