import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class32_Sub8 extends Class32 {

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class32_Sub8(@OriginalArg(0) Class132_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		super.aClass132_Sub1_21.method7645(false);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass132_Sub1_21.method7635(arg1);
		super.aClass132_Sub1_21.method7652(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7645(true);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return true;
	}
}
