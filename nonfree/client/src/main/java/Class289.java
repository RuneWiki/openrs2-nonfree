import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class289 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_39;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
	public final long aLong232;

	static {
		new Class40("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!jj;JI)V")
	public Class289(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass62_Sub3_39 = arg0;
		this.aLong232 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass62_Sub3_39.method3940(this.aLong232);
		super.finalize();
	}
}
