import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class49 {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public int anInt1949 = 0;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public int anInt1953 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!of;")
	private final Class236 aClass236_12 = new Class236(64);

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!ev;")
	private Interface5 anInterface5_1 = null;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!oh;")
	private final Class237 aClass237_20;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_19;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILclient!oh;Lclient!oh;Lclient!ev;)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Interface5 arg3) {
		this.aClass237_20 = arg2;
		this.anInterface5_1 = arg3;
		this.aClass237_19 = arg1;
		if (this.aClass237_19 != null) {
			this.anInt1949 = this.aClass237_19.method6315(1);
		}
		if (this.aClass237_20 != null) {
			this.anInt1953 = this.aClass237_20.method6315(1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!sq;[IJ)Ljava/lang/String;")
	public String method1676(@OriginalArg(1) Class316 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface5_1 != null) {
			@Pc(19) String local19 = this.anInterface5_1.method1353(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!tk;")
	public Class8_Sub5_Sub17 method1677(@OriginalArg(0) int arg0) {
		@Pc(13) Class8_Sub5_Sub17 local13 = (Class8_Sub5_Sub17) this.aClass236_12.method6242((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = this.aClass237_19.method6314(1, arg0);
		} else {
			local35 = this.aClass237_20.method6314(1, arg0 & 0x7FFF);
		}
		local13 = new Class8_Sub5_Sub17();
		local13.aClass49_2 = this;
		if (local35 != null) {
			local13.method7709(new Class8_Sub8(local35));
		}
		if (arg0 >= 32768) {
			local13.method7708();
		}
		this.aClass236_12.method6241((long) arg0, local13);
		return local13;
	}
}
