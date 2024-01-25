import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class325 {

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "Lclient!gj;")
	private Class3_Sub5 aClass3_Sub5_57 = new Class3_Sub5();

	@OriginalMember(owner = "client!sja", name = "j", descriptor = "Lclient!nc;")
	private final Class243 aClass243_13 = new Class243();

	@OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
	private final int anInt8968;

	@OriginalMember(owner = "client!sja", name = "k", descriptor = "I")
	private int anInt8969;

	@OriginalMember(owner = "client!sja", name = "h", descriptor = "Lclient!tca;")
	private final Class333 aClass333_34;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(I)V")
	public Class325(@OriginalArg(0) int arg0) {
		this.anInt8968 = arg0;
		this.anInt8969 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass333_34 = new Class333(local19);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IJ)Lclient!gj;")
	public Class3_Sub5 method7319(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub5 local15 = (Class3_Sub5) this.aClass333_34.method7489(arg0);
		if (local15 != null) {
			this.aClass243_13.method5457(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(JB)V")
	public void method7321(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub5 local10 = (Class3_Sub5) this.aClass333_34.method7489(arg0);
		if (local10 != null) {
			local10.method9034();
			local10.method9014();
			this.anInt8969++;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!gj;JZ)V")
	public void method7322(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt8969 == 0) {
			@Pc(19) Class3_Sub5 local19 = this.aClass243_13.method5462();
			local19.method9034();
			local19.method9014();
			if (local19 == this.aClass3_Sub5_57) {
				local19 = this.aClass243_13.method5462();
				local19.method9034();
				local19.method9014();
			}
		} else {
			this.anInt8969--;
		}
		this.aClass333_34.method7488(arg1, arg0);
		this.aClass243_13.method5457(arg0);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Z)V")
	public void method7323() {
		this.aClass243_13.method5460();
		this.aClass333_34.method7485();
		this.aClass3_Sub5_57 = new Class3_Sub5();
		this.anInt8969 = this.anInt8968;
	}
}
