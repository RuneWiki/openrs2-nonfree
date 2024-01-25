import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString37;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString36;

	static {
		@Pc(235) String local235 = "Unknown";
		try {
			local235 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(241) Exception local241) {
		}
		local235.toLowerCase();
		local235 = "Unknown";
		try {
			local235 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(252) Exception local252) {
		}
		local235.toLowerCase();
		local235 = "Unknown";
		try {
			local235 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(263) Exception local263) {
		}
		aString37 = local235.toLowerCase();
		local235 = "Unknown";
		try {
			local235 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(274) Exception local274) {
		}
		aString36 = local235.toLowerCase();
		local235 = "Unknown";
		try {
			local235 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(285) Exception local285) {
		}
		local235.toLowerCase();
		local235 = "~/";
		try {
			local235 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(296) Exception local296) {
		}
		new File(local235);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub8(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		@Pc(10) int local10 = super.aClass3_Sub22_31.method2838().method183();
		if (local10 < 96) {
			super.anInt10233 = 0;
		}
		if (super.anInt10233 > 1 && local10 < 128) {
			super.anInt10233 = 1;
		}
		if (super.anInt10233 > 2 && local10 < 192) {
			super.anInt10233 = 2;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 3) {
			super.anInt10233 = this.method8962();
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	public int method3663() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		return 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass3_Sub22_31.method2838().method183();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
	public boolean method3666() {
		@Pc(18) int local18 = super.aClass3_Sub22_31.method2838().method183();
		return local18 >= 96;
	}
}
