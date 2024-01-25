import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class298 {

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
	public int anInt7577 = 0;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
	public int anInt7579 = 0;

	@OriginalMember(owner = "client!qca", name = "h", descriptor = "Lclient!tja;")
	private final Class352 aClass352_52 = new Class352(64);

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "Lclient!cda;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "Lclient!bt;")
	private final Class34 aClass34_102;

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_101;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(ILclient!bt;Lclient!bt;Lclient!cda;)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Interface6 arg3) {
		this.aClass34_102 = arg1;
		this.aClass34_101 = arg2;
		this.anInterface6_1 = arg3;
		if (this.aClass34_102 != null) {
			this.anInt7579 = this.aClass34_102.method1233(1);
		}
		if (this.aClass34_101 != null) {
			this.anInt7577 = this.aClass34_101.method1233(1);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(J[IILclient!bja;)Ljava/lang/String;")
	public String method6587(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class27 arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(20) String local20 = this.anInterface6_1.method3331(arg0, arg2, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Lclient!ph;")
	public Class4_Sub5_Sub16 method6589(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub5_Sub16 local11 = (Class4_Sub5_Sub16) this.aClass352_52.method7653((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass34_101.method1239(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass34_102.method1239(1, arg0);
		}
		local11 = new Class4_Sub5_Sub16();
		local11.aClass298_2 = this;
		if (local29 != null) {
			local11.method6428(new Class4_Sub11(local29));
		}
		if (arg0 >= 32768) {
			local11.method6423();
		}
		this.aClass352_52.method7655((long) arg0, local11);
		return local11;
	}
}
