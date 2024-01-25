import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class214 {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!rv;")
	private Class3_Sub7 aClass3_Sub7_44 = new Class3_Sub7();

	@OriginalMember(owner = "client!kka", name = "h", descriptor = "Lclient!gw;")
	private final Class147 aClass147_5 = new Class147();

	@OriginalMember(owner = "client!kka", name = "m", descriptor = "I")
	private final int anInt5570;

	@OriginalMember(owner = "client!kka", name = "i", descriptor = "I")
	private int anInt5571;

	@OriginalMember(owner = "client!kka", name = "k", descriptor = "Lclient!qn;")
	private final Class313 aClass313_25;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5570 = arg0;
		this.anInt5571 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass313_25 = new Class313(local19);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(JB)V")
	public void method4924(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) this.aClass313_25.method7104(arg0);
		if (local10 != null) {
			local10.method9596();
			local10.method9251();
			this.anInt5571++;
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V")
	public void method4925() {
		this.aClass147_5.method3331();
		this.aClass313_25.method7101();
		this.aClass3_Sub7_44 = new Class3_Sub7();
		this.anInt5571 = this.anInt5570;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(IJ)Lclient!rv;")
	public Class3_Sub7 method4927(@OriginalArg(1) long arg0) {
		@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) this.aClass313_25.method7104(arg0);
		if (local17 != null) {
			this.aClass147_5.method3335(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILclient!rv;J)V")
	public void method4928(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5571 == 0) {
			@Pc(14) Class3_Sub7 local14 = this.aClass147_5.method3333();
			local14.method9596();
			local14.method9251();
			if (local14 == this.aClass3_Sub7_44) {
				local14 = this.aClass147_5.method3333();
				local14.method9596();
				local14.method9251();
			}
		} else {
			this.anInt5571--;
		}
		this.aClass313_25.method7107(arg1, arg0);
		this.aClass147_5.method3335(arg0);
	}
}
