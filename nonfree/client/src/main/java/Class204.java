import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class204 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public int anInt5354 = 0;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public int anInt5356 = 0;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!jo;")
	private final Class126 aClass126_45 = new Class126(64);

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!qo;")
	private Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_95;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!ok;")
	private final Class178 aClass178_96;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILclient!ok;Lclient!ok;Lclient!qo;)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Interface11 arg3) {
		this.aClass178_95 = arg2;
		this.anInterface11_1 = arg3;
		this.aClass178_96 = arg1;
		if (this.aClass178_96 != null) {
			this.anInt5356 = this.aClass178_96.method3833(1);
		}
		if (this.aClass178_95 != null) {
			this.anInt5354 = this.aClass178_95.method3833(1);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Lclient!qf;")
	public Class7_Sub4_Sub13 method4288(@OriginalArg(1) int arg0) {
		@Pc(11) Class7_Sub4_Sub13 local11 = (Class7_Sub4_Sub13) this.aClass126_45.method2822((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass178_95.method3838(arg0 & 0x7FFF, 1);
		} else {
			local27 = this.aClass178_96.method3838(arg0, 1);
		}
		local11 = new Class7_Sub4_Sub13();
		local11.aClass204_2 = this;
		if (local27 != null) {
			local11.method4281(new Class7_Sub14(local27));
		}
		if (arg0 >= 32768) {
			local11.method4277();
		}
		this.aClass126_45.method2824((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(JBLclient!fp;[I)Ljava/lang/String;")
	public String method4291(@OriginalArg(0) long arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface11_1 != null) {
			@Pc(14) String local14 = this.anInterface11_1.method4063(arg2, arg0, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}
}
